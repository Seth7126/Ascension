// 函数: _ZN9ascension21GetCardTypeFromStringEPKc
// 地址: 0xe144c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

if (strcasecmp("none", arg1) == 0)
    return 0

if (strcasecmp("Hero", arg1) == 0)
    return 1

if (strcasecmp("Construct", arg1) == 0)
    return 2

if (strcasecmp("Monster", arg1) == 0)
    return 3

if (strcasecmp("Event", arg1) == 0)
    return 4

if (strcasecmp("Soul Gem", arg1) == 0)
    return 5

if (strcasecmp("Treasure", arg1) == 0)
    return 6

if (strcasecmp("Champion", arg1) == 0)
    return 7

if (strcasecmp("Portal", arg1) == 0)
    return 8

if (strcasecmp("Vision", arg1) == 0)
    return 9

if (strcasecmp("Temple", arg1) == 0)
    return 0xa

return 0
