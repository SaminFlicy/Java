abstract class Wonders {
    abstract void display();

}
class GreatWall extends Wonders {
    void display() {
        System.out.println("The Great Wall of China is a series of fortifications that were built across the northern borders of China to protect against invasions.");
    }
}
class Petra extends Wonders {
    void display() {
        System.out.println("Petra is a historical and archaeological city in southern Jordan that is famous for its rock-cut architecture and water conduit system.");
    }
}
class ChristTheRedeemer extends Wonders {
    void display() {
        System.out.println("Christ the Redeemer is a statue of Jesus Christ in Rio de Janeiro, Brazil, and is one of the most famous landmarks in the world.");
    }
}
class MachuPicchu extends Wonders {
    void display() {
        System.out.println("Machu Picchu is an ancient Incan city located in the Andes Mountains of Peru, known for its well-preserved ruins and stunning views.");
    }
}
class ChichenItza extends Wonders {
    void display() {
        System.out.println("Chichen Itza is a large pre-Columbian archaeological site located in the Yucatan Peninsula of Mexico, known for its impressive Mayan ruins.");
    }
}
class RomanColosseum extends Wonders {
    void display() {
        System.out.println("The Roman Colosseum is an ancient amphitheater located in the center of Rome, Italy, and is one of the most iconic symbols of the Roman Empire.");
    }
}
class TajMahal extends Wonders {
    void display() {
        System.out.println("The Taj Mahal is a white marble mausoleum located in Agra, India, and is considered one of the most beautiful buildings in the world.");
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("The Seven Wonders of the World are:");
        Wonders[] wonders = new Wonders[7];
        wonders[0] = new GreatWall();
        wonders[1] = new Petra();
        wonders[2] = new ChristTheRedeemer();
        wonders[3] = new MachuPicchu();
        wonders[4] = new ChichenItza();
        wonders[5] = new RomanColosseum();
        wonders[6] = new TajMahal();

        for (Wonders wonder : wonders) {
            wonder.display();
            System.out.println();
        }
    }
}