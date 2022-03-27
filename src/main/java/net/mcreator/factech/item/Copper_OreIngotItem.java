
package net.mcreator.factech.item;

@FactechElements.ModElement.Tag
public class Copper_OreIngotItem extends FactechElements.ModElement {

	@ObjectHolder("factech:copper_oreingot")
	public static final Item block = null;

	public Copper_OreIngotItem(FactechElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("copper_oreingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
