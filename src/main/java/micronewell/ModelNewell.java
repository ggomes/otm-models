package micronewell;

import core.*;
import core.geometry.Side;
import dispatch.Dispatcher;
import error.OTMErrorLog;
import error.OTMException;
import jaxb.OutputRequest;
import jaxb.Roadparam;
import models.vehicle.AbstractVehicleModel;
import output.AbstractOutput;
import output.InterfaceVehicleListener;
import output.animation.AbstractLinkInfo;
import utils.StochasticProcess;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ModelNewell extends AbstractVehicleModel {

    public ModelNewell(String name, boolean is_default, StochasticProcess process) {
        super(name, is_default, process);
    }

    @Override
    public AbstractVehicle translate_vehicle(AbstractVehicle abstractVehicle) {
        return null;
    }

    @Override
    public AbstractVehicle create_vehicle(Long aLong, Set<InterfaceVehicleListener> set) {
        return null;
    }

    @Override
    public void reset(Link link) {

    }

    @Override
    public void validate(OTMErrorLog otmErrorLog) {

    }

    @Override
    public void register_with_dispatcher(Scenario scenario, Dispatcher dispatcher, float v) {

    }

    @Override
    public AbstractOutput create_output_object(Scenario scenario, String s, String s1, OutputRequest outputRequest) throws OTMException {
        return null;
    }

    @Override
    public AbstractLaneGroup create_lane_group(Link link, Side side, Float aFloat, int i, int i1, Set<RoadConnection> set, Roadparam roadparam) {
        return null;
    }

    @Override
    public Map<AbstractLaneGroup, Double> lanegroup_proportions(Collection<? extends AbstractLaneGroup> collection) {
        return null;
    }

    @Override
    public AbstractLinkInfo get_link_info(Link link) {
        return null;
    }
}
