/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.i2m.converge.plugins.actions.flashcast;

import dk.i2m.converge.core.annotations.OutletAction;
import dk.i2m.converge.core.content.NewsItemPlacement;
import dk.i2m.converge.core.plugin.EditionAction;
import dk.i2m.converge.core.plugin.PluginContext;
import dk.i2m.converge.core.workflow.Edition;
import dk.i2m.converge.core.workflow.OutletEditionAction;
import java.util.Date;
import java.util.Map;
import java.util.ResourceBundle;

/**
 *
 * @author fred
 */
@OutletAction
public class FlashCastEditonAction implements EditionAction {

    public void execute(PluginContext ctx, Edition edition, OutletEditionAction action) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void executePlacement(PluginContext ctx, NewsItemPlacement placement, Edition edition, OutletEditionAction action) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isSupportEditionExecute() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isSupportPlacementExecute() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Map<String, String> getAvailableProperties() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getVendor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Date getDate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ResourceBundle getBundle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getAbout() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
