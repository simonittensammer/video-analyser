package at.htl.control;

import at.htl.entity.Cam;
import io.quarkus.hibernate.orm.panache.Panache;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class CamRepository implements PanacheRepository<Cam> {
    public void update(Cam cam){
        Panache.getEntityManager().merge(cam);
    }
}
