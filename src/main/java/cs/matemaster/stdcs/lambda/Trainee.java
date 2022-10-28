package cs.matemaster.stdcs.lambda;

import lombok.ToString;

import java.time.LocalDate;
import java.time.Year;
import java.util.function.Function;

/**
 * @author matemaster
 */
@ToString
public class Trainee {

    private String traineeId;

    private String name;

    private Boolean sex;

    private Year startYear;

    private Year finishYear;

    private String nation;

    private LocalDate birthday;

    private String major;

    private String job;

    private Trainee(Builder builder) {
        traineeId = builder.traineeId;
        name = builder.name;
        sex = builder.sex;
        startYear = builder.startYear;
        finishYear = builder.finishYear;
        nation = builder.nation;
        birthday = builder.birthday;
        major = builder.major;
        job = builder.job;
    }

    public static Trainee of(Function<Builder, ObjectBuilder<Trainee>> func) {
        return func.apply(new Builder()).build();
    }

    public static class Builder implements ObjectBuilder<Trainee> {
        private String traineeId;

        private String name;

        private Boolean sex;

        private Year startYear;

        private Year finishYear;

        private String nation;

        private LocalDate birthday;

        private String major;

        private String job;

        public Builder() {
        }

        public final Builder traineeId(String traineeId) {
            this.traineeId = traineeId;
            return this;
        }

        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder sex(Boolean sex) {
            this.sex = sex;
            return this;
        }

        public final Builder startYear(Year startYear) {
            this.startYear = startYear;
            return this;
        }

        public final Builder finishYear(Year finishYear) {
            this.finishYear = finishYear;
            return this;
        }

        public final Builder nation(String nation) {
            this.nation = nation;
            return this;
        }

        public final Builder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        public final Builder major(String major) {
            this.major = major;
            return this;
        }

        public final Builder job(String job) {
            this.job = job;
            return this;
        }


        @Override
        public Trainee build() {
            return new Trainee(this);
        }
    }
}
