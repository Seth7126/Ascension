// 函数: _ZN14ascensionrules46TriggerMarkDefeatEventForRallyVoidIfReputationEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11c338
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* result = *(arg4 + 4)

if (result == 0x1b)
    result = *(arg4 + 0x68)
    
    if (result != 0 && *(result + 4) == 0x11)
        if (*(*(arg2 + 4) + 0x30) u>= 0x16 && *(*(arg3 + 0xc) + 0x88) s< arg5)
            return result
        
        *(result + 0x58) |= 0x10

return result
