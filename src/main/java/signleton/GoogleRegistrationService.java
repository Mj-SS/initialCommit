package signleton;

public class GoogleRegistrationService implements RegistrationService{

    private final RegistrationService registrationService;

    public GoogleRegistrationService(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @Override
    public void register(String username, String email) {

    }

}
