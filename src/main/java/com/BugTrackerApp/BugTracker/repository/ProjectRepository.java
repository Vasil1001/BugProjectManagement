package com.BugTrackerApp.BugTracker.repository;

import com.BugTrackerApp.BugTracker.model.Ticket;
import com.BugTrackerApp.BugTracker.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.BugTrackerApp.BugTracker.model.Project;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Integer> {
    @Query("select tickets from Project pr where pr.Id = ?1")
    List<Ticket> getTicketsByProject(Integer Id);

    @Query("select members from Project pr where pr.Id = ?1")
    List<User> getMembersByProject(Integer Id);


//    List<Ticket> selProjectTickets();
//    List<Project> findByTicketId(int ticketId);
//
//    @Query( "select o from MyObject o where inventoryId in :ids" )
//    List<Ticket> findByInventoryIds(@Param("ids") List<Long> inventoryIdList);
}
