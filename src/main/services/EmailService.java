import org.springframework.beans.factory.annotation.Autowired;

public class EmailService {
    @Autowired
    EmailRepository emailRepository;

    public void sendEmail(EmailModel emailModel) {

    }
}
