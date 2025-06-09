package model.exceptions;

// public class DomainException extends Exception {
//     private static final long serialVersionUID = 1L;
//
//     public DomainException(String message) {
//         super(message);
//     }
//
// }

// The difference between extending RuntimeException and Exception is:
// RunTimeException -> unchecked exception -> does not need to be declared in the method or treated.
// Exception -> checked exception -> must be declared in the method signature and must be treated.
//
// Example:
// public Reservation(int roomNumber, Date checkIn, Date checkOut) throws DomainException {}
// 
// In this case, we are using RuntimeException because we want to avoid the need to declare the exception in the method:

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String message) {
        super(message);
    }

}
