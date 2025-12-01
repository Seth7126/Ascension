// 函数: _ZN9ascension21CActiveEffectInstance6CreateEP9lua_State
// 地址: 0xe7b28
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = lua_touserdata(arg1, 1)
lua_tolstring(arg1, 2, 0)
void* r0_4 = ascension::CDatabase::GetActiveEffect(ascension::g_Database)
void* r0_6 = lua_touserdata(arg1, 3)
void* r0_8 = lua_touserdata(arg1, 4)
void** r0_9 = operator new(0x150)
*(r0 + 4) += 1
core::CInstance::CInstance(r0_9, r0)
*r0_9 = _vtable_for_ascension::CActiveEffectInstance + 8
r0_9[3] = r0_4
r0_9[4] = r0_6
r0_9[5] = r0_8
__aeabi_memclr8(&r0_9[6], 0x12c)
int32_t r0_15
int32_t r1_2
r1_2:r0_15 = *(r0_4 + 8)
r0_9[0x52] = r0_15
r0_9[0x53] = r1_2
core::CWorldBase::AddInstance(r0)
lua_pushlightuserdata(arg1, r0_9)
return 1
