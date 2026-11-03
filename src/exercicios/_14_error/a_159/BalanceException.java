package exercicios._14_error.a_159;

class BalanceException extends Error {
    private static final long serialVersionUID = 1L;

    public BalanceException(String msg){
        super(msg);
    }
}
