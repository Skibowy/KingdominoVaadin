package pl.kingdomino.Kingdomino;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.data.renderer.NativeButtonRenderer;
import com.vaadin.flow.router.Route;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Route("hello")
public class HelloGui extends HorizontalLayout {

    public HelloGui(){
        List<Dominos> dominosList = Arrays.stream(Dominos.values())
                .collect(Collectors.toList());

        System.out.println("lista początkowa: " + dominosList);

        List<Dominos2> dominosList2 = Arrays.stream(Dominos2.values())
                .collect(Collectors.toList());

        System.out.println("lista początkowa: " + dominosList2);

        Grid<Dominos> grid = new Grid<>(Dominos.class);
        grid.removeAllColumns();
        grid.setItems(dominosList);
        grid.addColumn(Dominos::getOrderNumber).setHeader("#").setSortable(true).setWidth("4em").setFlexGrow(0);
        grid.addColumn(new ComponentRenderer<>(domino -> new Image(domino.getImageUrl(), String.valueOf(domino.getOrderNumber()))))
                .setHeader("Image").setSortable(true).setWidth("15em").setFlexGrow(0);
        grid.addColumn(new NativeButtonRenderer<>(
                item -> "Wybierz " + item.orderNumber,
                dominos -> {
                    dominosList.remove(dominos);
                    grid.getDataProvider().refreshAll();
                    System.out.println("lista po usunieciu: " + dominosList);
                }
        )).setWidth("8em").setFlexGrow(0);

        Grid<Dominos2> grid2 = new Grid<>(Dominos2.class);
        grid2.removeAllColumns();
        grid2.setItems(dominosList2);
        grid2.addColumn(Dominos2::getOrderNumber).setHeader("#").setSortable(true).setWidth("4em").setFlexGrow(0);
        grid2.addColumn(new ComponentRenderer<>(domino -> new Image(domino.getImageUrl(), String.valueOf(domino.getOrderNumber()))))
                .setHeader("Image").setSortable(true).setWidth("15em").setFlexGrow(0);
        grid2.addColumn(new NativeButtonRenderer<>(
                item -> "Wybierz " + item.orderNumber,
                dominos -> {
                    dominosList2.remove(dominos);
                    grid2.getDataProvider().refreshAll();
                    System.out.println("lista po usunieciu: " + dominosList2);
                }
        )).setWidth("8em").setFlexGrow(0);
        grid.setHeight("45em");
        grid2.setHeight("45em");
        grid.addThemeVariants(GridVariant.LUMO_NO_BORDER);
        grid2.addThemeVariants(GridVariant.LUMO_NO_BORDER);
        grid.addThemeVariants(GridVariant.LUMO_NO_ROW_BORDERS);
        grid2.addThemeVariants(GridVariant.LUMO_NO_ROW_BORDERS);
        add(grid);
        add(grid2);
    }





}
