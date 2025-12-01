// 函数: _ZN9ascension24GetCardFactionFromStringEPKc
// 地址: 0xe159c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (strcasecmp("none", arg1) == 0)
    return 0

if (strcasecmp("Enlightened", arg1) == 0)
    return 1

if (strcasecmp("Lifebound", arg1) == 0)
    return 2

if (strcasecmp("Mechana", arg1) == 0)
    return 3

int32_t temp0 = 0
int32_t i = strcasecmp("Void", arg1)

while (i != 0)
    i u>>= 1
    temp0 += 1

return (0x20 - temp0) u>> 5 << 2
