class TeamMember {
}

class Player extends TeamMember {
    void play() {
        System.out.println("Player is playing");
    }
}

class Coach extends TeamMember {
    void train() {
        System.out.println("Coach is training players");
    }
}

class Doctor extends TeamMember {
    void heal() {
        System.out.println("Doctor heals players");
    }
}