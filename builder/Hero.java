package builder;

/**
 * Created by liushihan on 2018/9/12.
 */
public final class Hero {
    private String name;
    private String skill;

    private Hero(Builder builder) {
        this.name = builder.name;
        this.skill = builder.skill;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }

    static class Builder {
        private String name;
        private String skill;

        public Builder builderName(String name) {
            this.name = name;
            return this;
        }

        public Builder builderSkill(String skill) {
            this.skill = skill;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
