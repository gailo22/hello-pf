package hello.pf.web.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import hello.pf.domain.Team;
import hello.pf.web.search.ApprovableBean;

@ManagedBean
@ViewScoped
public class TeamBean implements ApprovableBean<Team, TeamBean>, Serializable {

    private static final long serialVersionUID = -5099529301135514414L;
    
    private Team team;
    
    public TeamBean() {
    }

    @Override
    public TeamBean approve(Team t) {
        return this;
    }

    @Override
    public TeamBean cancel(Team t) {
        
        Team team = new Team();
        team.setId(456L);
        team.setName("My Team");
        
        setTeam(team);
        
        return this;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}
