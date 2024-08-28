interface Notifier {
    void send();
}

class EmailNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("Sending notification via email...");
        // Actual email notification logic here...
    }
}

abstract class NotifierDecorator implements Notifier {
    private Notifier decoratedNotifier;

    public NotifierDecorator(Notifier decoratedNotifier) {
        this.decoratedNotifier = decoratedNotifier;
    }

    @Override
    public void send() {
        decoratedNotifier.send();
    }
}

class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier decoratedNotifier) {
        super(decoratedNotifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sending SMS notification...");
        // Actual SMS notification logic here...
    }
}

class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier decoratedNotifier) {
        super(decoratedNotifier);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sending notification via Slack...");
        // Actual Slack notification logic here...
    }
}

public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();

        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        smsNotifier.send();

        Notifier slackNotifier = new SlackNotifierDecorator(emailNotifier);
        slackNotifier.send();
    }
}
