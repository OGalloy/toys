
import model.FileOperation;
import model.Repository;
import model.RepositoryOut;
import controller.Controller;
import view.*;
public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation("toys.csv");
        Repository repository = new Repository(fileOperation);
        FileOperation fileOperationOut = new FileOperation("out.txt");
        RepositoryOut repositoryOut = new RepositoryOut(fileOperationOut);
        Controller controller = new Controller(repository, repositoryOut);
        View view = new View(controller);
        view.run();
    }
}

