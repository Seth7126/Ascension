// 函数: _ZN14ascensionrules35IfHaveUntransformedMechanaConstructEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x1022bc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* i = *(arg2 + 0x54)

for (int32_t r0 = *(arg2 + 0x58); i != r0; i = &i[1])
    void* r2 = *(*i + 0x10)
    
    if (*(*(r2 + 0xc) + 0x150) != 0)
        if (ascension::CWorld::QueryCardFaction(arg1, arg2, r2) != 0)
            return 1
        
        r0 = *(arg2 + 0x58)

return 0
