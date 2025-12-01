// 函数: _ZN14ascensionrules37TriggerMarkDefeatEventForRallyMechanaEP13CStateMachinePN9ascension21CActiveEffectInstanceEPN4core9CInstanceEPNS2_6CEventEj
// 地址: 0x11c294
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0_1 = *(arg4 + 4)

if (r0_1 != 0x1b)
    return r0_1

void* r0 = *(arg4 + 0x68)

if (r0 != 0 && *(r0 + 4) == 0x11)
    *(r0 + 0x58) |= 8

return r0
