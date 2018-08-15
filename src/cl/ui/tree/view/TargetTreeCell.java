/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.ui.tree.view;

import cl.ui.icons.IconAssetManager;
import cl.ui.mvc.CustomData;
import static cl.ui.mvc.CustomData.Type.PARENT;
import coordinate.parser.attribute.MaterialT;
import filesystem.fx.icons.FileIconManager;
import javafx.scene.control.TreeCell;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;

/**
 *
 * @author user
 */
public class TargetTreeCell extends TreeCell<CustomData>{
    public TargetTreeCell()
    {
        setOnDragDetected(e ->{            
            Dragboard db = startDragAndDrop(TransferMode.COPY);
            ClipboardContent content = new ClipboardContent();        
            TargetTreeCell cell = (TargetTreeCell)e.getSource();
            
            if(!cell.getTreeItem().isLeaf()) return;
            
            CustomData data = cell.getItem();
            content.put(CustomData.getFormat(), data);
            db.setContent(content);
            e.consume();
        });
    }
    @Override
    public void updateItem(CustomData item, boolean empty)
    {
        super.updateItem(item, empty);
        if(empty)
        {
            setGraphic(null);
            setText(null);            
        }        
        else
        {
            if(getTreeItem().getParent() == null)
                setGraphic(FileIconManager.getIcon("home"));
            else if(item.getType() == PARENT)
                setGraphic(FileIconManager.getIcon("folder"));
            else if(item.getData() instanceof MaterialT)                  
                setGraphic(IconAssetManager.getIcon((MaterialT)item.getData()));
            setText(item.getName());
        }            
    }
}
