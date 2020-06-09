package in.himanshugawari.springblog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.himanshugawari.springblog.model.Post;
import in.himanshugawari.springblog.model.User;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

	List<Post> findByUser(User user);
}
