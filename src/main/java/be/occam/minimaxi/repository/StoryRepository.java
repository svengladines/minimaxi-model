package be.occam.minimaxi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story, String>{
	
	public Story findByUuid( String id );
	public Story findByRecipient( String recipient );

}
