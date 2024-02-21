package Service;

import Domain.Piesa;
import Repository.IRepository;

import java.util.Collection;

public class Service {
    IRepository<Piesa> repo;
    public Service(IRepository<Piesa> repo) {
        this.repo = repo;
    }
    public void add(Piesa a) {
        repo.add(a);
    }
    public void delete(int id) {
        repo.remove(id);
    }

    public void update(int pos, Piesa a) {
        repo.update(pos, a);
    }

    public Collection<Piesa> getAll() {
        return repo.getAll();
    }
}