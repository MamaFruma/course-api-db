package roma.spring.exception;

public class NoEntityException extends Exception {
    public NoEntityException(Long id) {
        System.out.println("Entity was not found by ID = " + id);
    }
}
