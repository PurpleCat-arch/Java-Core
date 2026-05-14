public class FinallyVsReturn {
    public static void main(String[] args) {
        System.out.println("Test 1 - Return in try: " + testReturnInTry());
        System.out.println("Test 2 - Return in catch: " + testReturnInCatch());
        System.out.println("Test 3 - Return in finally: " + testReturnInFinally());
    }

    static String testReturnInTry() {
        try {
            return "from try";
        } finally {
            System.out.println("  finally executes before return from try");
        }
    }

    static String testReturnInCatch() {
        try {
            int result = 10 / 0;
            return "from try";
        } catch (ArithmeticException e) {
            return "from catch";
        } finally {
            System.out.println("  finally executes before return from catch");
        }
    }

    static String testReturnInFinally() {
        try {
            return "from try";
        } finally {
            // WARNING: return in finally overrides try/catch return
            return "from finally (overrides!)";
        }
    }
}
