package signleton;

public class FBRegistrationService implements RegistrationService{

    private final RegistrationService registrationService;

    public FBRegistrationService(final RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @Override
    public void register(String username, String email) {

    }
}



