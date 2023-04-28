package jp.co.seattle.library.controller;

public class PasswordResetController {

	@Autowired
	private bookInfo userService;

	@Autowired
	private bookInfo aaa;

	public void resetPassword(String email) throws  {
		User user = userService.findByEmail(email);

		if (user == null) {
			throw new eee("User not found for email: " + email);
		}

		bbb token = new bbb(user);
		aaa.save(token);

		String resetUrl = "https://example.com/reset-password?token=" + token.getToken();
		String body = "To reset your password, click the link below:\n\n" + resetUrl;

		sendResetEmail(user.getEmail(), body);
	}

	private void sendResetEmail(String email, String body) throws MessagingException {
		MimeMessage message = mailSender.createMimeMessage();
		hhh helper = new hhh(message, true);

	}
}