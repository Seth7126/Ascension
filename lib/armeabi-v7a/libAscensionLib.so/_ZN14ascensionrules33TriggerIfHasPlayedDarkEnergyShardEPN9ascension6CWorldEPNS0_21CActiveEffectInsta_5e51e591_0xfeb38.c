// 函数: _ZN14ascensionrules33TriggerIfHasPlayedDarkEnergyShardEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfeb38
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r6 = *(arg1 + 0xb80)
int32_t r7 = *(arg1 + 0xb84)

if (r6 != r7)
    do
        if ((zx.d(r6[1].b) & 1) == 0)
            void* r0_2 = *(*r6 + 0xc)
            
            if (*(r0_2 + 0x88) == 6 && strcasecmp(r0_2 + 0x44, "Dark Energy Shard") == 0)
                return 1
        
        r6 = &r6[2]
    while (r7 != r6)

return 0
