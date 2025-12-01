// 函数: _ZN9ascension6CWorld22RemoveActiveEffectListERNSt6__ndk16vectorIPNS_21CActiveEffectInstanceENS1_9allocatorIS4_EEEE
// 地址: 0xf72f4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* entry_r1
int32_t r1 = *entry_r1
int32_t result

while (true)
    result = entry_r1[1]
    
    if (r1 == result)
        break
    
    *(result - 4)
    entry_r1[1] = result - 4
    ascension::CWorld::RemoveActiveEffect(arg1)
    r1 = *entry_r1

return result
