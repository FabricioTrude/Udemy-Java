package aulas._14_error.a_155_exception;

class DomainException extends Exception{
    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
