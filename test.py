# Metin dosyasindaki satirlardaki kelime sayisini hesaplayan bir program

# Dosya adi
dosya_adi = "metin_dosyasi.txt"

# Dosyayi açma
try:
    with open(dosya_adi, "r") as dosya:
        # Satir sayaci
        satir_sayisi = 0
        # Her satirdaki kelime sayisi
        kelime_sayilari = []

        # Dosyadaki her satir için işlem yap
        for satir in dosya:
            # Satir sayisini artir
            satir_sayisi += 1
            # Satirdaki kelimeleri ayir
            kelimeler = satir.split()
            # Kelime sayisini hesapla ve listeye ekle
            kelime_sayilari.append(len(kelimeler))

        # Dosyadaki toplam satir sayisini ve her satirdaki ortalama kelime sayisini hesapla
        toplam_kelimeler = sum(kelime_sayilari)
        ortalama_kelime_sayisi = toplam_kelimeler / satir_sayisi

        # Sonuçlari ekrana yazdir
        print("Toplam satir sayisi:", satir_sayisi)
        print("Toplam kelime sayisi:", toplam_kelimeler)
        print("Ortalama kelime sayisi:", ortalama_kelime_sayisi)

except FileNotFoundError:
    print("Belirtilen dosya bulunamadi.")
except Exception as e:
    print("Bir hata oluştu:", e)
