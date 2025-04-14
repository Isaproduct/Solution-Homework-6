package ChainofResponsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler faq = new FAQBotHandler();
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();

        // Set up the chain of responsibility
        faq.setNext(junior);
        junior.setNext(senior);

        // List of issues
        String[] issues = {"password_reset", "refund_request", "account_ban", "unknown_bug"};

        // Handle the issues
        for (String issue : issues) {
            faq.handle(issue);
        }
    }
}