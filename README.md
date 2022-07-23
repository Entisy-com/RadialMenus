


## Authors

- [@FireTamer81](https://www.github.com/FireTamer81)




## Usage/Examples

```java
public class RadialTestScreen extends AbstractRadialMenu {
    public RadialTestScreen() {
        super(getItems(), new TextComponent("Radial Screen Testing"), getFooterText());
    }

    private static Component getFooterText() {
        Component footerText;

        //Should be the same value as the abstract method getMaxItemsPerPage()
        if (getItems().size() > 8) {
            footerText = new TextComponent("Page " + currentPage + "; Scroll to see others");
        } else {
            footerText = new TextComponent("");
        }

        return footerText;
    }

    private static List<IRadialMenuButton> getItems() {
        List<IRadialMenuButton> items = new ArrayList<>();

        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

        items.add(testTextButton);
        items.add(testItemRadialButton);
        items.add(testBlockItemRadialButton);
        items.add(testSpriteRadialButton);

        items.add(testItemRadialButtonWithText);
        items.add(testBlockItemRadialButtonWithText);
        items.add(testSpriteRadialButtonWithText);

        items.add(testCategoryButton);

        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

        return items;
    }

    private static final IRadialMenuButton testTextButton = new RadialMenuButton(
            null, null, null,
            new TextComponent("Test Text Button"), null,
            new TextComponent("Text Button"), null) {
        @Override
        public void click() {
            final var player = Minecraft.getInstance().player;
            player.displayClientMessage(new TextComponent("Text Button Works"), false);
        }
    };

    private static final IRadialMenuButton testItemRadialButton = new RadialMenuButton(
            new ItemStack(Items.BONE), null, null,
            new TextComponent("Test Item Button"), null,
            null, null) {
        @Override
        public void click() {
            final var player = Minecraft.getInstance().player;
            player.displayClientMessage(new TextComponent("Item Button Works"), false);
        }
    };

    private static final IRadialMenuButton testBlockItemRadialButton = new RadialMenuButton(
            null, (BlockItem) Blocks.PUMPKIN.asItem(), null,
            new TextComponent("Test BlockItem Button"), null,
            null, null) {
        @Override
        public void click() {
            final var player = Minecraft.getInstance().player;
            player.displayClientMessage(new TextComponent("BlockItem Button Works"), false);
        }
    };

    private static final IRadialMenuButton testSpriteRadialButton = new RadialMenuButton(
            null, null, TextureHandler.BLUE_KI_BLAST_SPRITE,
            new TextComponent("Test TextureSprite Button"), null,
            null, null) {
        @Override
        public void click() {
            final var player = Minecraft.getInstance().player;
            player.displayClientMessage(new TextComponent("TextureSprite Button Works"), false);
        }
    };

    private static final IRadialMenuButton testItemRadialButtonWithText = new RadialMenuButton(
            new ItemStack(Items.BONE), null, null,
            new TextComponent("Test Item Button"), null,
            new TextComponent("Bone Item"), null) {
        @Override
        public void click() {
            final var player = Minecraft.getInstance().player;
            player.displayClientMessage(new TextComponent("Item Button Works"), false);
        }
    };

    private static final IRadialMenuButton testBlockItemRadialButtonWithText = new RadialMenuButton(
            null, (BlockItem) Blocks.PUMPKIN.asItem(), null,
            new TextComponent("Test BlockItem Button"), null,
            new TextComponent("Pumpkin Block"), null) {
        @Override
        public void click() {
            final var player = Minecraft.getInstance().player;
            player.displayClientMessage(new TextComponent("BlockItem Button Works"), false);
        }
    };

    private static final IRadialMenuButton testSpriteRadialButtonWithText = new RadialMenuButton(
            null, null, TextureHandler.BLUE_KI_BLAST_SPRITE,
            new TextComponent("Test TextureSprite Button"), null,
            new TextComponent("Basic Ki Blast"), null) {
        @Override
        public void click() {
            final var player = Minecraft.getInstance().player;
            player.displayClientMessage(new TextComponent("TextureSprite Button Works"), false);
        }
    };

    private static final IRadialMenuButton testCategoryButton = new RadialMenuCategoryButton(
            null, null, null,
            new TextComponent("Test Category"), null,
            new TextComponent("Click to open"), null) {
        @Override
        public void click() {
            final var player = Minecraft.getInstance().player;
            player.displayClientMessage(new TextComponent("TextureSprite Button Works"), false);
        }

        @Override
        public List<IRadialMenuButton> getCategoryObjects() {
            List<IRadialMenuButton> items = new ArrayList<>();

            /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

            items.add(testTextButton);
            items.add(testItemRadialButton);
            items.add(testBlockItemRadialButton);
            items.add(testSpriteRadialButton);

            /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

            return items;
        }
    };


    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


    /**
     * {@inheritDoc}
     */
    @Override
    public boolean shouldMenuStayOpen() { return KeyBindsUtil.isKeyDown(KeyBindHandler.openRadialSkillMenu); }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean shouldDrawHoveredButtonTitle() { return true; }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean shouldClipMouseToRadial() { return true; }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean allowClickOutsideBounds() { return true; }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getRadialSize() { return 2.0f; }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getMaxItemsPerPage() { return 8; }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getRadialColor() { return 0x3F000000; }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getRadialButtonHoverColor() { return 0x3FFFFFFF; }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getOpenAnimationLength() { return 3.0f; }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isPauseScreen() { return false; }
}
```
