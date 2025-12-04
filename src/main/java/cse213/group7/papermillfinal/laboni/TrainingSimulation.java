package cse213.group7.papermillfinal.laboni;

public class TrainingSimulation {
     String name;
     String department;
     String skill;
     int experience;

    public TrainingSimulation(String name, String department, String skill, int experience) {
        this.name = name;
        this.department = department;
        this.skill = skill;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "TrainingSimulation{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", skill='" + skill + '\'' +
                ", experience=" + experience +
                '}';
    }
}

