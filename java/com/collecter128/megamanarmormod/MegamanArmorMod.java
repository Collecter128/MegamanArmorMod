package com.collecter128.megamanarmormod;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.data.CustomRecipeBuilder;
import net.minecraft.item.BlockItem;
import net.minecraft.item.IDyeableArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.collecter128.megamanarmormod.core.BlockInit;
import com.collecter128.megamanarmormod.core.CustomItemColors;
import com.collecter128.megamanarmormod.core.CustomItemRenderer;
import com.collecter128.megamanarmormod.core.EntityTypesInit;
import com.collecter128.megamanarmormod.core.FeatureInit;
import com.collecter128.megamanarmormod.core.ItemInit;
import com.collecter128.megamanarmormod.core.ModSoundEvents;
import com.collecter128.megamanarmormod.core.VillagerInit;
import com.collecter128.megamanarmormod.items.ArmorColorizerCustom;

import java.util.stream.Collectors;

// The value here shoanauld match an entry in the META-INF/mods.toml file
@Mod("megamanarmormod")
public class MegamanArmorMod
{
	public static final String Mod_ID = "megamanarmormod";
	
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    
    public static ItemGroup MMTab = new MegamanGroup("MegamanTab");
    public static ItemGroup MMMaterialsTab = new MaterialsGroup("MMMaterialsTab");
    public static ItemGroup MMBannerMats = new BannerMatGroup("MMBannerMatsTab");
    public static ItemGroup ArmorColorizer = new ArmorColorizerGroup("ColorizerTab");
    
    //private final static BlockColors blockColorsC = BlockColors.init();

    public MegamanArmorMod() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
    	
    	ItemInit.Items.register(bus);
    	BlockInit.Blocks.register(bus);
    	EntityTypesInit.EntityTypes.register(bus);
    	MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
    	VillagerInit.VillagerProffesions.register(bus);
    	VillagerInit.Point_of_interestTypes.register(bus);
    	// CustomRecipeBuilder.customRecipe(IRecipeSerializer.CRAFTING_SPECIAL_ARMORDYE).build(consumer, "armorcolorizer_dye");
    	
    	ModSoundEvents.register(bus);
    	
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
        	
            LOGGER.info("HELLO from Register Block");
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> blockRegistryEvent) {
            // register a new item here
            //LOGGER.info("HELLO from Register Block");
        	BlockInit.Blocks.getEntries().stream().map(RegistryObject:: get).forEach(block-> {
        		blockRegistryEvent.getRegistry().register(new BlockItem(block, new Item.Properties().tab(MegamanArmorMod.MMTab)).setRegistryName(block.getRegistryName()));
        	});;
        	
        	RenderTypeLookup.setRenderLayer(BlockInit.RuinsBlockGLadder.get(), RenderType.cutout());
        	
        	RenderTypeLookup.setRenderLayer(BlockInit.BombLadder.get(), RenderType.cutout());
        	RenderTypeLookup.setRenderLayer(BlockInit.CutLadder.get(), RenderType.cutout());
        	RenderTypeLookup.setRenderLayer(BlockInit.ElecLadder.get(), RenderType.cutout());
        	RenderTypeLookup.setRenderLayer(BlockInit.FireLadder.get(), RenderType.cutout());
        	RenderTypeLookup.setRenderLayer(BlockInit.GutsLadder.get(), RenderType.cutout());
        	RenderTypeLookup.setRenderLayer(BlockInit.IceLadder.get(), RenderType.cutout());
        	RenderTypeLookup.setRenderLayer(BlockInit.OilLadder.get(), RenderType.cutout());
        	RenderTypeLookup.setRenderLayer(BlockInit.TimeLadder.get(), RenderType.cutout());
        	
        	RenderTypeLookup.setRenderLayer(BlockInit.BlueMysteryData.get(), RenderType.cutout());
        	RenderTypeLookup.setRenderLayer(BlockInit.GreenMysteryData.get(), RenderType.cutout());
        	
        	//net.minecraft.client.renderer.color.ItemColors.register(itemColor, itemsIn);
        	//CustomItemColors.init(blockColorsC);
        	//Minecraft.blockColors = BlockColors.init();
        	//newblockColors = BlockColors.init();
        	//Object CustomitemColors = 
        	//CustomItemColors.init(BlockColors.init());
        	//CustomItemColors.init(Minecraft.class.getClass().getDeclaredField(name));
        	//CustomItemColors.init(Minecraft.getInstance().getItemColors());
        	//CustomItemRenderer.registerItemRenderer();
        	//ColorRegistry.
        	//CustomItemColors.init(getBlockColors());
        }
        
        @SubscribeEvent
        public void registerCustomItemColors(final ColorHandlerEvent.Item event) {

               event.getItemColors().register(
            		   (stack, colorIn) -> colorIn < 0 ? -1 : ((IDyeableArmorItem) stack.getItem()).getColor(stack),
                    		   ItemInit.MegamanArmor_Body.get()
               );
               event.getItemColors().register(
            		   (stack, colorIn) -> colorIn < 0 ? -1 : ((IDyeableArmorItem) stack.getItem()).getColor(stack),
                    		   ItemInit.MainColorColorizer.get()
//                       (stack, colorIn) -> colorIn < 0 ? -1 : ((ArmorColorizerCustom) stack.getItem()).getColor(stack),
//                    		   ItemInit.MainColorColorizer.get()
               );
        }//Register Item Colors End
        
    }
    
    public static class MegamanGroup extends ItemGroup{

		public MegamanGroup(String label) {
			super(label);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return ItemInit.MegamanArmor_Head.get().getDefaultInstance();
		}
    	
    }
    
  public static class MaterialsGroup extends ItemGroup{

		public MaterialsGroup(String label) {
			super(label);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return ItemInit.Ceratanium.get().getDefaultInstance();
		}
  	
  }
    
    public static class BannerMatGroup extends ItemGroup{

		public BannerMatGroup(String label) {
			super(label);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return ItemInit.BlankBannerPattern.get().getDefaultInstance();
		}
    	
    }
    
    public static class ArmorColorizerGroup extends ItemGroup{

		public ArmorColorizerGroup(String label) {
			super(label);
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return ItemInit.ShotgunIceColorizer.get().getDefaultInstance();
		}
    	
    }
   
    
    
    
}
