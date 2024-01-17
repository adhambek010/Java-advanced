package org.example;

public interface RobotPlan {
    void setRobotHead(String head);
    void setRobotTorso(String torso);
    void setRobotArms(String arms);
    void setRobotLegs(String legs);
}
interface RobotBuilder{
    void buildRobotHead();
    void buildRobotTorso();
    void buildRobotArms();
    void buildRobotLegs();
    Robot getRobot();
}