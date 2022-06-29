package designpattern.builder.demo2;

/**
 * @author mengruo
 * @date 2022/6/29 11:46
 */
public class NyPizza extends Pizza {

    private Size size;

    public NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    public static class Builder extends Pizza.Builder<NyPizza.Builder> {

        private Size size;

        public Builder size(Size size) {
            this.size = size;
            return this;
        }


        @Override
        protected Builder self() {
            return this;
        }

        @Override
        protected NyPizza build() {
            return new NyPizza(this);
        }
    }

    public enum Size {
        /**
         * 尺寸
         */
        SMALL,
        MEDIUM,
        LARGE
    }

}
