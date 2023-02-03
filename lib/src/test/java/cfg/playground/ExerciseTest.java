package cfg.playground;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ExerciseTest {
    @Test
    void transformWorks() {
        var exercise = new Exercise();
        var result = exercise.transform(List.of(4, 0, -1, 2, -9, 10, 2));

        assertThat(result).isEqualTo(List.of(2, 10, -9, 2, -1, 0, 4, 10, 4, 2, 2, 0, -1, -9));
    }
}
