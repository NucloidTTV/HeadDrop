/*     */ package me.baks.hd;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ import org.bukkit.inventory.meta.SkullMeta;
/*     */ 
/*     */ public class SkullManager {
/*   8 */   static Main plugin = Main.plugin;
/*     */   
/*     */   static ItemStack player(String pName) {
/*  11 */     String name = name("Player").replace("<name>", pName);
/*  12 */     return skull(pName, "§b" + name);
/*     */   }
/*     */   
/*     */   static ItemStack skeleton() {
/*  16 */     return skull("MHF_Skeleton", name("Skeleton"));
/*     */   }
/*     */   
/*     */   static ItemStack zombie() {
/*  20 */     return skull("MHF_Zombie", name("Zombie"));
/*     */   }
/*     */   
/*     */   static ItemStack creeper() {
/*  24 */     return skull("MHF_Creeper", name("Creeper"));
/*     */   }
/*     */   
/*     */   static ItemStack blaze() {
/*  28 */     return skull("MHF_Blaze", name("Blaze"));
/*     */   }
/*     */   
/*     */   static ItemStack caveSpider() {
/*  32 */     return skull("MHF_CaveSpider", name("CaveSpider"));
/*     */   }
/*     */   
/*     */   static ItemStack ghast() {
/*  36 */     return skull("MHF_Ghast", name("Ghast"));
/*     */   }
/*     */   
/*     */   static ItemStack pigZombie() {
/*  40 */     return skull("MHF_PigZombie", name("PigZombie"));
/*     */   }
/*     */   
/*     */   static ItemStack enderman() {
/*  44 */     return skull("MHF_Enderman", name("Enderman"));
/*     */   }
/*     */   
/*     */   static ItemStack lavaSlime() {
/*  48 */     return skull("MHF_LavaSlime", name("LavaSlime"));
/*     */   }
/*     */   
/*     */   static ItemStack slime() {
/*  52 */     return skull("MHF_Slime", name("Slime"));
/*     */   }
/*     */   
/*     */   static ItemStack spider() {
/*  56 */     return skull("MHF_Spider", name("Spider"));
/*     */   }
/*     */   
/*     */   static ItemStack chicken() {
/*  60 */     return skull("MHF_Chicken", name("Chicken"));
/*     */   }
/*     */   
/*     */   static ItemStack pig() {
/*  64 */     return skull("MHF_Pig", name("Pig"));
/*     */   }
/*     */   
/*     */   static ItemStack sheep() {
/*  68 */     return skull("MHF_Sheep", name("Sheep"));
/*     */   }
/*     */   
/*     */   static ItemStack cow() {
/*  72 */     return skull("MHF_Cow", name("Cow"));
/*     */   }
/*     */   
/*     */   static ItemStack squid() {
/*  76 */     return skull("MHF_Squid", name("Squid"));
/*     */   }
/*     */   
/*     */   static ItemStack villager() {
/*  80 */     return skull("MHF_Villager", name("Villager"));
/*     */   }
/*     */   
/*     */   static ItemStack ironGolem() {
/*  84 */     return skull("MHF_Golem", name("IronGolem"));
/*     */   }
/*     */   
/*     */   static ItemStack mushroomCow() {
/*  88 */     return skull("MHF_MushroomCow", name("MushroomCow"));
/*     */   }
/*     */   
/*     */   static ItemStack ocelot() {
/*  92 */     return skull("MHF_Ocelot", name("Wolf"));
/*     */   }
/*     */   
/*     */   static ItemStack wolf() {
/*  96 */     return skull("MHF_Wolf", name("Wolf"));
/*     */   }
/*     */   
/*     */   static ItemStack wither() {
/* 100 */     return skull("MHF_Wither", name("Wither"));
/*     */   }
/*     */   
/*     */   static ItemStack guardian() {
/* 104 */     return skull("MHF_Guardian", name("Guardian"));
/*     */   }
/*     */   
/*     */   static ItemStack eguardian() {
/* 108 */     return skull("MHF_EGuardian", name("EGuardian"));
/*     */   }
/*     */   
/*     */   static ItemStack witch() {
/* 112 */     return skull("MHF_Witch", name("Witch"));
/*     */   }
/*     */   
/*     */   private static String name(String name) {
/* 116 */     return Config.names.get(name);
/*     */   }
/*     */ 
/*     */   
/*     */   private static ItemStack skull(String owner, String name) {
/* 121 */     ItemStack item = new ItemStack(Material.SKULL_ITEM);
/* 122 */     item.setDurability((short)3);
/* 123 */     SkullMeta sm = (SkullMeta)item.getItemMeta();
/* 124 */     sm.setOwner(owner);
/* 125 */     sm.setDisplayName("§b" + name);
/* 126 */     item.setItemMeta((ItemMeta)sm);
/*     */     
/* 128 */     return item;
/*     */   }
/*     */ }


/* Location:              C:\Users\William\Downloads\HeadDrop.jar!\me\baks\hd\SkullManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */