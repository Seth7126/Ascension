// 函数: _ZN14ascensionrules28WhenOwnerAcquiresMechanaCardEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfe7e0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) == 0x12)
    core::CCardInstance* r1 = *(arg3 + 0x4c)
    
    if (r1 == *(*(arg2 + 0x10) + 0xc))
        int32_t r2 = *(arg3 + 0x50)
        
        if (r2 != 0)
            return ascension::CWorld::QueryCardFaction(arg1, r1, r2) __tailcall

return 0
