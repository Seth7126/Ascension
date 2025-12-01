// 函数: _ZN14ascensionrules32MarkDefeatEventForRallyLifeboundEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x115a6c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CEvent* result = arg7

if (result != 0)
    if (*(result + 4) != 0x1b)
        return result
    
    result = *(result + 0x68)
    
    if (result != 0 && *(result + 4) == 0x11)
        *(result + 0x58) |= 4

return result
