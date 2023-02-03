package cfg.playground;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class AdderTest {
    @Test
    void twoPlusThreeEqualsFive() {
        var adder = new Adder();
        var result = adder.add(2, 3);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void threePlusFiveEqualsEight() {
        var adder = new Adder();
        var result = adder.add(3, 5);

        assertThat(result).isEqualTo(8);
    }

    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "3, 5, 8"
    })
    void addShouldWorkCorrectly_usingCsvSource(int a, int b, int expectedResult) {
        var adder = new Adder();
        var result = adder.add(a, b);

        assertThat(result).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @MethodSource("addTestMethodSource")
    void addShouldWorkCorrectly_usingMethodSource(int a, int b, int expectedResult) {
        var adder = new Adder();
        var result = adder.add(a, b);

        assertThat(result).isEqualTo(expectedResult);
    }

    public static Stream<Arguments> addTestMethodSource() {
        return Stream.of(
                Arguments.of(2, 3, 5),
                Arguments.of(3, 5, 8)
        );
    }
}
