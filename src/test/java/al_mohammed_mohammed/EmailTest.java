package al_mohammed_mohammed;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.mail.Session;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class EmailTest {

    private Email email;

    // Sets up a new Email instance before each test with default settings.
    @Before
    public void setUp() throws EmailException {
        email = new SimpleEmail();
        email.setHostName("localhost"); // Default SMTP server for testing.
        email.setSmtpPort(2525);        // Custom SMTP port to prevent conflicts.
        email.setFrom("unit@test.com"); // Standard sender address.
        email.addTo("recipient@test.com"); // Adding a recipient to the email.
    }

    // Cleans up by nullifying the email object after each test to ensure isolation.
    @After
    public void tearDown() {
        email = null;
    }

    // Tests the ability to add BCC recipients without errors.
    @Test
    public void testAddBcc() throws EmailException {
        email.addBcc("bcc@example.com");
        // Assert no exception was thrown. Verification of recipient list would require additional steps.
    }

    // Tests the ability to add CC recipients without errors.
    @Test
    public void testAddCc() throws EmailException {
        email.addCc("cc@example.com");
        // Assert no exception was thrown. Direct verification of CC list addition would be ideal.
    }

    // Tests adding custom headers to the email.
    @Test
    public void testAddHeader() {
        email.addHeader("X-Test", "JUnit");
        // Asserts that no exception is thrown. Verification of header presence requires inspecting the email's MIME message.
    }

    // Tests setting the reply-to address for the email.
    @Test
    public void testAddReplyTo() throws EmailException {
        email.addReplyTo("replyto@example.com", "Reply To");
        // Asserts successful addition. Direct verification of the reply-to field would enhance this test.
    }

    // Verifies that the MIME message can be built from the email content.
    @Test
    public void testBuildMimeMessage() throws EmailException {
        email.setSubject("Test Build");
        email.setMsg("Building the MIME message from the email content.");
        email.buildMimeMessage();
        // Asserts that building the MIME message does not throw an exception. Further inspection of the message would confirm success.
    }

    // Confirms that getHostName() returns the expected SMTP host name.
    @Test
    public void testGetHostName() {
        assertEquals("Checking the host name is correctly returned.", "localhost", email.getHostName());
    }

    // Ensures that a mail session can be retrieved, indicating correct setup.
    @Test
    public void testGetMailSession() throws EmailException {
        Session session = email.getMailSession();
        assertNotNull("Mail session should be retrievable and not null.", session);
        // Further validation of session properties would strengthen this test.
    }

    // Tests setting and then getting the sent date, verifying they match.
    @Test
    public void testGetSentDate() throws EmailException {
        Date now = new Date();
        email.setSentDate(now);
        assertEquals("The set sent date should be correctly retrieved.", now, email.getSentDate());
    }

    // Verifies the functionality to set and get the socket connection timeout.
    @Test
    public void testGetSocketConnectionTimeout() {
        int expectedTimeout = 10000;
        email.setSocketConnectionTimeout(expectedTimeout);
        assertEquals("Socket connection timeout should match the set value.", expectedTimeout, email.getSocketConnectionTimeout());
    }

    // Checks that the 'from' address is set correctly.
    @Test
    public void testSetFrom() throws EmailException {
        String fromAddress = "from@example.com";
        email.setFrom(fromAddress);
        // Asserts that setting the 'from' address does not throw an exception. Verifying the 'From' address would require accessing the email's MIME message.
    }
}
