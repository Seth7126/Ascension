// 函数: _ZN14ascensionrules32IfHasCurrentTurnRunesAndAnyPowerEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x101ddc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r1 = *(arg1 + 0xb48)
int32_t r2 = *(arg1 + 0xb40)
uint32_t r0 = zx.d(*(arg1 + 0xb2b))

if (r0 != 0)
    r2 += r1

int32_t r3 = 0

if (r2 u>= r0 + arg4)
    r3 = 1

if (r1 != 0)
    r1 = 1

return r1 & r3
