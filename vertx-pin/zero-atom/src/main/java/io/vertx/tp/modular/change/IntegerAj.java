package io.vertx.tp.modular.change;

import io.vertx.up.util.Ut;

final class IntegerAj extends AbstractAdjuster {

    public IntegerAj(final Class<?> type) {
        super(type);
    }

    @Override
    public Object inValue(final Object ucmdbInput) {
        final String liberal = this.literal(ucmdbInput);
        if (Ut.isInteger(liberal)) {
            return Integer.parseInt(liberal);
        } else {
            return this.parseUnit(liberal);
        }
    }

    @Override
    public boolean isSame(final Object oldValue, final Object newValue) {
        final String oldLiteral = this.literal(oldValue);
        final String newLiteral = this.literal(newValue);
        return this.parseUnit(oldLiteral).equals(this.parseUnit(newLiteral));
    }

    private Integer parseUnit(final String literal) {
        /*
         * 去掉 GB, TB, MB, G, T, M 等单位
         */
        if(Ut.notNil(literal)){
            final String normalized = literal.replaceAll(
                    "(GB|TB|MB|G|T|M)", ""
            ).trim();
            return Ut.notNil(normalized)?Integer.parseInt(normalized):0;
        }else{
            return 0;
        }
    }
}
