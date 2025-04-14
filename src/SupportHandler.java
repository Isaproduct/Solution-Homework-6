
    public abstract class SupportHandler {
        protected SupportHandler nextHandler;

        public void setNext(SupportHandler handler) {
            this.nextHandler = handler;
        }

        public abstract void handle(String issue);
    }


