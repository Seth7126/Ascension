// 函数: _ZN14ascensionrules42WhenConstructOwnerGainsHonorFromNonMonsterEPN9ascension6CWorldEPNS0_21CActiveEffectInstanceEPNS0_6CEventEj
// 地址: 0xfeea4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (*(arg3 + 4) != 0x1c || *(arg3 + 0x4c) != *(*(arg2 + 0x10) + 0xc))
    return 0

int32_t r0_4 = *(arg3 + 0x50)

if (r0_4 != 0)
    void* r0_5 =
        __dynamic_cast(r0_4, _typeinfo_for_core::CInstance, _typeinfo_for_core::CCardInstance, 0)
    
    if (r0_5 != 0)
        if (*(*(r0_5 + 0xc) + 0x88) != 3)
            return 1
        
        return 0

return 1
