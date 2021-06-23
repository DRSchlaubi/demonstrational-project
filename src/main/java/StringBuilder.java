import org.jetbrains.annotations.Nullable;

public class StringBuilder {
    public static String main(String shit) {
        return new java.lang.StringBuilder()
                .append("dce" + shit)
                .toString();
    }

    void xy() {
        final var nullable = nullable();
        if (nullable != null) {
        }
    }

    @Nullable
    public String nullable() {
        return null;
    }
}
