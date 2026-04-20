class Component {
    void showInfo() {
        System.out.println("Computer component");
    }
}

class CPU extends Component {
    void showInfo() {
        System.out.println("This is CPU");
    }
}

class RAM extends Component {
    void showInfo() {
        System.out.println("This is RAM");
    }
}

class GPU extends Component {
    void showInfo() {
        System.out.println("This is GPU");
    }
}