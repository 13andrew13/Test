package DAO;

import model.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupDAOImpl implements GroupDAO {
    private List<Group> groups = new ArrayList<Group>();
    private static GroupDAOImpl instance = new GroupDAOImpl();

    private GroupDAOImpl() {
        for(int i = 0; i<3; i++){
            groups.add(new Group("group" + i));
        }

    }

    public static GroupDAOImpl getInstance() {
        return instance;
    }

    public List<Group> getGroups() {

        return groups;
    }
}
